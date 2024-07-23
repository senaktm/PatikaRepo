package EntityLayer.Entities;

import EntityLayer.Enum.StructureType;

public abstract class Structure {
	private StructureType type;
    private double price;
    private double squareMeter;
    private int rooms;
    private int livingRooms;

    public Structure(StructureType type,double price, double squareMeter, int rooms, int livingRooms) {
    	this.type = type;
    	this.price = price;
        this.squareMeter = squareMeter;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    
    public StructureType getType() {
		return type;
	}


	public void setType(StructureType type) {
		this.type = type;
	}


	public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSquareMeter(double squareMeter) {
		this.squareMeter = squareMeter;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public void setLivingRooms(int livingRooms) {
		this.livingRooms = livingRooms;
	}
	  @Override
	    public String toString() {
	        return type + "{" +
	                "price=" + price +
	                ", squareMeter=" + squareMeter +
	                ", rooms=" + rooms +
	                ", livingRooms=" + livingRooms +
	                '}';
	    }
}
