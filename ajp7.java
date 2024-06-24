
// Create one
// superclass HillStations
// and three
// subclasses Manali, Mussoorie, Gulmarg.
// Subclasses extend
// the superclass
// and override

// its location()

// and famousFor() method. i.call the location()

// and famousFor() method by the Parent class’, i.e. Hillstations class. 
// As it refers to the base class object and the base class method overrides the superclass method; 
// the base class method is invoked at runtime. 
// ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
class HillStations {
    void location(){
        System.out.println("Located in HillStation");
    }
    void famousFor(){
        System.out.println("Famous for its beauty");
    }
}

class Manali extends HillStations{
    
    @Override
    void location(){
        System.out.println("Manali is located in HP");
    }
    
    @Override
    void famousFor(){
        System.out.println("Famous for beauty and adventures");
    }
}
class Mussoorie extends HillStations{
    
    @Override
    void location(){
        System.out.println("Mussoorie is located in UK");
    }
    
    @Override
    void famousFor(){
        System.out.println("Famous for beauty and architecture");
    }
}
class Gulmarg extends HillStations{
    
    @Override
    void location(){
        System.out.println("Gulmarg is located in JnK");
    }
    
    @Override
    void famousFor(){
        System.out.println("Famous for skiing");
    }
}

public class ajp7 {
    public static void main(String[] args) {
        HillStations h1 = new Gulmarg();
        HillStations h2 = new Gulmarg();
        HillStations h3 = new Gulmarg();

        //for Manali
        h1.location();
        h1.famousFor();
        
        //for Mussoorie
        h2.location();
        h2.famousFor();
        
        //for Gulmarg
        h3.location();
        h3.famousFor();
    }
}