package BitManupulation;

public class SetRightMost {
    
    static int setBit(int num) {
        // Set the rightmost unset bit by using bitwise OR with (num + 1)
        num = num | (num + 1);
        return num;
    }
}
