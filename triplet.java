//This program is created by Aryaan Rabara 21CE112
//Github link:-https://github.com/21CE112/21CE112_PRAC_ASSIGNMENT.git
//Aim:-Create a Triplet class that encapsulates three objects of the same data type in a given instance of Triplet.
public class triplet<S1, S2, S3> {
    private S1 first;
    private S2 second;
    private S3 third;

    triplet(S1 first, S2 second, S3 third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "[" + first + "," + second + "," + third + "]";
    }
}