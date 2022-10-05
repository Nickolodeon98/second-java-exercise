package pojo;

public class ByPassNumberCreator implements NumberCreator{

    @Override
    public int numberReturn(int num) {
        return num;
    }
}
