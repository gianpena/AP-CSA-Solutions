public int walkDogs(int hour){
    int available = numAvailableDogs(hour);
    int dogs_to_walk = Math.min(available, maxDogs);
    updateDogs(hour, dogs_to_walk);
    return dogs_to_walk;
}