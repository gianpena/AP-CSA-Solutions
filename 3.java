public int moreHistoryThanMathAbsences() {
    int ans = 0;
    for(CourseRecord historyRecord: this.historyList) {
        for(CourseRecord mathRecord: this.mathList) {
            if(!historyRecord.getStudentID().equals(mathRecord.getStudentID()))
                continue;
            
            ans += historyRecord.getAbsences() > mathRecord.getAbsences() ? 1 : 0;
        }
    }

    return ans;
}