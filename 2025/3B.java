public ArrayList<Match> buildMatches(){
	int size = competitorList.size();
	ArrayList<Match> matches = new ArrayList<>();
	if(size == 1) return matches;
	if(size % 2 == 0){
		for(int i=0;i<size/2;++i){
			matches.add(new Match(competitorList.get(i), competitorList.get(size-i-1)));
		}
	} else {
		for(int i=1;i<=size/2;++i){
			matches.add(new Match(competitorList.get(i), competitorList.get(size-i)));
		}
	}
	return matches;
}