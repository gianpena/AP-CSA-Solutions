public SumOrSameGame(int numRows, int numCols){
	puzzle = new int[numRows][numCols];
	for(int row = 0; row < numRows; ++row){
		for(int col = 0; col < numCols; ++col){
			puzzle[row][col] = (int) (Math.random() * 9 + 1);
		}
	}
}