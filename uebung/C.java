public class C {
    int a;
    C(int a) {
        this.a = a;
    }
    void f() {
        a *= 2;
        System.out.println("a = " + a);
    }
    public static void main(String[] args) {
        // Erzeuge ein Objekt der Klasse C. Dabei soll der Wert des
        // Attributs a mit 5 initialisiert werden.
	C test = new C(5);
        // Rufe die Methode f() auf.
	test.f();
    }
}
