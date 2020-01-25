/**
 * 
 *
 * nach [Sedgewick/Wayne]
 */

public class Triangle {
  public static void main(String[] args) {
    // Speicher input 1 in s, was die Seinlaenge representieren soll
    double s = Double.parseDouble(args[0]); // Seitenl.

    // Berechne die Hoehe des Dreieckes 
    double h = s * Math.sqrt(3.0)/2.0;      // Hoehe
    
    // Zeichne die Basis des Dreiecks, beginne links unten mit x0 = 0, y0 = 0, x1 = s, y1 = 0
    StdDraw.line(0.0, 0.0,   s, 0.0);       // Basis
    StdDraw.line(0.0, 0.0, s/2,   h);       // linke Seite
    StdDraw.line(  s, 0.0, s/2,   h);       // rechte Seite
    StdDraw.setPenRadius(0.010);
    StdDraw.point(s/2, h/3.0);              // Schwerpunkt
  }
}
