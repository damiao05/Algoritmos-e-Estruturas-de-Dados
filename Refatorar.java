class ArrayCopier {
    public static void main(String[] arguments) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        float[] array2 = new float[array1.length];
        
        // Imprimir array1
        System.out.print("array1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        
        // Copiar valores de array1 para array2, interrompendo no valor '1'
        System.out.print("array2: [ ");
        for (int i = 0; i < array1.length && array1[i] != 1; i++) {
            array2[i] = (float) array1[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
    }
}