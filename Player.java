public class Player {
    private Room currentRoom;
    private String name;
    private float carryweight;

    public Player(String nome, float weight){
        this.name = nome;
        this.carryweight = weight;
    }
    public void setCarryweight(float carryweight) {
        this.carryweight = carryweight;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getCarryweight() {
        return carryweight;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


}
