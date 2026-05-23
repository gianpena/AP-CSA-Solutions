public Round(String[] names){
	competitorList = new ArrayList<>();
	for(int i=0;i<names.length;++i){
		competitorList.add(new Competitor(names[i], i+1));
	}
}