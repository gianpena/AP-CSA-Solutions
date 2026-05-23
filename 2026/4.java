public int getPointsForRow(int targetRow) {
    int total = 0;

    String firstColumnColor = this.board[targetRow][0].getColor();
    boolean allSame = true;
    for(int col = 0; col < this.board[0].length && allSame; ++col) {
        allSame = allSame && this.board[targetRow][col].getColor().equals(firstColumnColor);
        total += this.board[targetRow][col].getPoints();
    }

    return (allSame ? 2 : 1) * total;
}