package jumper;
import coordinates.Coordinates;

public class Jumper {
public Coordinates start;
public Coordinates end;
public String name;
public Jumper(Coordinates start , Coordinates end){
    this.start= start;
    this.end =end;
    if(start.row > end.row)
   // if row, col of Coordinates clas is not public then make a function to getRow in Coordinates class , then call it here
    //if(start.getRow() > end.getRow())
    this.name = "Ladder";
    else 
    this.name ="Snake";
}
public String getJumperName(){
    return this.name;
}
}
