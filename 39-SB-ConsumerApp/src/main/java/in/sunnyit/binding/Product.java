package in.sunnyit.binding;

public class Product {
	
	    private String id;
	    private String name;
	    private Data data;

	    // Getters and setters
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Data getData() {
	        return data;
	    }

	    public void setData(Data data) {
	        this.data = data;
	    }

	    // Inner class for "data"
	    public static class Data {
	        private String color;
	        private String capacity;

	        // Getters and setters
	        public String getColor() {
	            return color;
	        }

	        public void setColor(String color) {
	            this.color = color;
	        }

	        public String getCapacity() {
	            return capacity;
	        }

	        public void setCapacity(String capacity) {
	            this.capacity = capacity;
	        }
	    }
	
}
