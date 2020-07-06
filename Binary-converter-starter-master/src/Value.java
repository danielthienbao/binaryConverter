public class Value<InitialVal> {
    private int InitialVal;

    public Value(int init) {
        this.InitialVal = init;
    }

    public int[] convertToBinary() {
        int[] binary = new int[8];
        //TODO: fill up your code right here to have InitialVal convert to binary each
        //      digit is an index in binary array.
        int i = 0;
        while (InitialVal > 0) {
            if (InitialVal % 2 == 0) { //if number is even, divide by 2 and set number slot to 0
                InitialVal /= 2;
                binary[i] = 0;
            } else { //else, minus 1 and divide by 2. set number slot to 1
                InitialVal--;
                InitialVal /= 2;
                binary[i] = 1;
            }
            i++; //prepare the loop for the next slot
        }
        return binary;
    }

    public void printBinary() {
        //TODO: print InitialVal as a binary, (Hint you might want to call convertToBinary() here)\
        int[] number = convertToBinary();
        for (int i = number.length - 1; i >= 0; i--) { //reverse the array by printing the last number and going backwards
            System.out.print(number[i]);
        }
    }
}