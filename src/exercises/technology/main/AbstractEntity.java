package exercises.technology.main;



public abstract class AbstractEntity {
private int id;
public int setId(){
    int nextId = 0;
    nextId++;
    return nextId;
}
}
