package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        return helperBinarySearch(data, 0, data.length -1, target);
    }

    private static int helperBinarySearch(int data[], int left, int right, int target){
        int answer = 0;
        int half = (left + right) / 2;
        if(left > right){
            answer =  -1;
        }else if(target == data[half]){
            answer =  half;
        }else if(target < data[half]){
            answer =  helperBinarySearch(data, left, half - 1, target);
        }else if(target > data[half]){
            answer =  helperBinarySearch(data,  half + 1, right,  target);
        }
        return answer;
    }
}
