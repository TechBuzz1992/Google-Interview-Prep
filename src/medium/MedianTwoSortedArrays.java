package medium;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,3,4,5,6};
        int[] nums2 = {3,4,5,6,7,8,9};

        System.out.println(new MedianTwoSortedArrays().getMedian(nums1, nums2));

    }

    public double getMedian(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr[index++] = nums1[i++];
            } else {
                arr[index++] = nums2[j++];
            }

        }

        while (i < nums1.length) {
            arr[index++] = nums1[i++];
        }

        while (j < nums2.length) {
            arr[index++] = nums2[j++];
        }

        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1] / 2);
        }
    }

}