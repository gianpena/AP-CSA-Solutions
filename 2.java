class Bottle {
    private double volume;
    private double capacity;
    public Bottle(double capacity) {
        this.volume = this.capacity = capacity;
    }

    public double updateAmount(double quantity) {
        this.volume -= quantity;
        if(4 * this.volume < this.capacity)
            this.volume = this.capacity;

        return this.volume;
    }
}