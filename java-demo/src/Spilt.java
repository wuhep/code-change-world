import java.util.Arrays;

public class Spilt {

    public static void main(String[] args) {
        String input = "2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,4,4,4,5,5,5,5,5,5,6,6,7,7,8,9,10,10,11,11,11,11,11,11,11,11,12,13,14,15,16,17,17,18,19,19,20,21,22,22,22,23,24,25,25,26,26,27,27,27,28,29,29,30,31,37,38,40,40,40,40,40,40,40,40,40,41,42,43,44,45,46,48,49,50,51,52,53,54,55,56,57,64,64,65,68,69,70,70,71,72,72,72,73,74,74,74,75,76,76,76,77,77,78,79,79,79,79,79,79,79,79,80,81,81,82,82,83,83,83,83,83,83,83,83,84,85,89,93,95,101,102,103,104,104,104,104,105,111,112,112,112,112,112,113,113,113,113,114,119,119,119,119,119,119,119,119,120,121,122,123,124,125,125,126,127,127,128,128,128,128,128,128,128,128,128,128,128,128,128,128,128,128,128,128,129,129,129,129,132,132,132,133,133,133,133,133,133,133,138,140,140,140,140,140,140,140,140,140,140,140,140,140,141,143,143,144,144,145,145,145,145,152,154,154,155,155,155,156,156,156,157,157,157,158,159,159,160,160,161,161,162,162,162,162,162,162,162,162,162,162,165,165,165,166,167,168,170,171,172,173";
        String[] split = input.split(",");
        int[] output = new int[split.length];
        String index = "begin";
        int num = 1;
        for (int i = 0; i < split.length; i++) {
            if (!index.equals(split[i])){
                index = split[i];
                num = 1;
            }
            output[i] = num++;
        }
        System.out.println(Arrays.toString(output));
    }
}
