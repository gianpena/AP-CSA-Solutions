public Account(String requestedName) {
	if(isAvailable(requestedName)) {
		this.username = requestedName;
		return;
	}

	int i=1;
	while(!isAvailable(requestedName + i))
		i++;
	
	this.username = requestedName + i;
}