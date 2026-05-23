public int dogWalkShift(int startHour, int endHour){
	int paid = 0;
	for(int hour = startHour; hour <= endHour; ++hour){
		int walked = walkDogs(hour);
		paid += 5 * walked;
		if(walked == maxDogs || (9 <= hour && hour <= 17))
			paid += 3;
	}
	return paid;
}