class SerieFibonacci {
    private long valor;
    private CalcularFibonacci calcularFibonacci;

    public SerieFibonacci(long valor) {
        this.valor = valor;
        this.calcularFibonacci = new CalcularFibonacci();
    }

    public long obtenerFibonacciEnPosicion(long posicion) {
        return calcularFibonacci.calcularFibonacci(posicion);
    }

    public long obtenerPosicionDeFibonacci(long numero) {
        for (long i = 0; i < valor; i++) {
            if (calcularFibonacci.calcularFibonacci(i) == numero) {
                return i;
            }
        }
        return -1; // Si el número no está en la serie, se devuelve -1
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < valor; i++) {
            sb.append(calcularFibonacci.calcularFibonacci(i)).append(" ");
        }
        return sb.toString();
    }
}