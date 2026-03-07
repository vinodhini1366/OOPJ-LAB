
class Box {
    double width;
    double height;
    double depth;

   
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    
    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

   
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {

        
        Box mybox1 = new Box(5, 10, 15); 
        Box mybox2 = new Box();          
        Box mycube = new Box(7);         

        
        double vol1 = mybox1.volume();
        double vol2 = mybox2.volume();
        double vol3 = mycube.volume();

        
        System.out.println("Volume of mybox1 = " + vol1);
        System.out.println("Volume of mybox2 = " + vol2);
        System.out.println("Volume of mycube = " + vol3);
    }
}