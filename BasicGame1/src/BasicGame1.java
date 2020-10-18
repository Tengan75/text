import java.util.Random;

public class BasicGame1 {
	static int gameLoop = 100;
	static int height = 10;
	static int width = 10;

	public static void main(String[] args) throws InterruptedException {
		String playerMark = "O";
		int playerrow = 2;
		int playercolumn = 2;
		Direction playerdirection = Direction.RIGHT;

		String enemyMark = "-";
		int enemyrow = 7;
		int enemycolumn = 4;
		Direction enemydirection = Direction.LEFT;

		String[][] level = new String[height][width];
		initlevel(level);
		addRandomWall(level, 1, 0);
		for (int iterationNumber = 1; iterationNumber <= gameLoop; iterationNumber++) {
			// játékos léptetése
			if (iterationNumber % 15 == 0) {
				playerdirection = changeDirection(playerdirection);
			}
			int[] playerCoordinates = makeMove(playerdirection, level, playerrow, playercolumn);
			playerrow = playerCoordinates[0];
			playercolumn = playerCoordinates[1];

			// ellenfél léptetése0
			if (iterationNumber % 10 == 0) {
				enemydirection = changeDirection(enemydirection);
			}
			int[] enemyCoordinates = makeMove(enemydirection, level, enemyrow, enemycolumn);
			enemyrow = enemyCoordinates[0];
			enemycolumn = enemyCoordinates[1];

			draw(level, playerMark, playerrow, playercolumn, enemyMark, enemyrow, enemycolumn);
			addSomeDelay(200L, iterationNumber);

			if (playerrow == enemyrow && playercolumn == enemycolumn) {
				break;
			}
		}
		System.out.println("A játék vége.");
	}

	static void addRandomWall(String[][] level, int numberOfHorizontalWalls, int numberOfVerticalWalls) {
		for (int i = 0; i < numberOfHorizontalWalls; i++) {
			addHorizontalWall(level);
		}
		for (int i = 0; i < numberOfVerticalWalls; i++) {
			addVerticalWall(level);
		}
	}

	static void addHorizontalWall(String[][] level) {
		Random random = new Random();
		int wallWidth = random.nextInt(width - 3);
		int wallRow = random.nextInt(height - 2) + 1;
		int wallColumn = random.nextInt(width - 2 - wallWidth);
		for (int i = 0; i < wallWidth; i++) {
			level[wallRow][wallColumn + i] = "x";
		}
	}

	static void addVerticalWall(String[][] level) {
	}

	static void addSomeDelay(long timeout, int iterationNumber) throws InterruptedException {
		System.out.println("----------" + iterationNumber + "----------");
		Thread.sleep(timeout);
	}

	static int[] makeMove(Direction direction, String[][] level, int row, int column) {
		switch (direction) {
		case UP:
			if (level[row - 1][column].equals(" ")) {
				row--;
			}
			break;
		case DOWN:
			if (level[row + 1][column].equals(" ")) {
				row++;
			}
			break;
		case LEFT:
			if (level[row][column - 1].equals(" ")) {
				column--;
			}
			break;
		case RIGHT:
			if (level[row][column + 1].equals(" ")) {
				column++;
			}
			break;
		}
		return new int[] { row, column };
	}

	static void initlevel(String[][] level) {
		for (int row = 0; row < level.length; row++) {
			for (int column = 0; column < level[row].length; column++) {
				if (row == 0 || row == height - 1 || column == 0 || column == width - 1) {
					level[row][column] = "X";
				} else {
					level[row][column] = " ";
				}
			}
		}
	}

	static Direction changeDirection(Direction direction) {
		switch (direction) {
		case RIGHT:
			return Direction.DOWN;
		case DOWN:
			return Direction.LEFT;
		case LEFT:
			return Direction.UP;
		case UP:
			return Direction.RIGHT;
		}
		return direction;
	}

	static void draw(String[][] board, String playerMark, int playerRow, int playerColumn, String enemyMark, int enemyRow, int enemyColumn) {
		for (int row = 0; row < height; row++) {
			for (int column = 0; column < width; column++) {
				if (row == playerRow && column == playerColumn) {
					System.out.print(playerMark);
				} else if (row == enemyRow && column == enemyColumn) {
					System.out.print(enemyMark);
				} else {
					System.out.print(board[row][column]);
				}
			}
			System.out.println();
		}
	}
}