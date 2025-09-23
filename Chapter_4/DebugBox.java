
public class DebugBox
{
public static void main(String[]args ){
   DebugBox box = new DebugBox();
   box.showData();
}

private int width;
private int length;
private int height;

public DebugBox(){
length = 1;
width = 1;
height = 1;
}

public DebugBox(int width, int length, int height){
this.width = width;
this.length = width;
this.height = width;
}

public double getVolume(){
double vol = length * width * height;
return vol;
}

public void showData(){
System.out.println("Width: " + width + " Length: " +
length + " Height: " + height + " Volume: " + getVolume()) ;
}


}
