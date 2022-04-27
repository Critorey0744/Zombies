package com.mycompany.principal;
import java.util.ArrayList;

    public class ubicaciones {
        private String nombreUbicacion;
        private float Distancia;
        private int Zombies;

        public ubicaciones(String nombreUbicacion, float Distancia, int Zombies) {
            this.nombreUbicacion = nombreUbicacion;
            this.Distancia = Distancia;
            this.Zombies = Zombies;
        }

        public ubicaciones() {
        }

        public String getNombreUbicacion() {
            return nombreUbicacion;
        }

        public float getDistancia() {
            return Distancia;
        }

        public int getZombies() {
            return Zombies;
        }

        public void setNombreUbicacion(String nombreUbicacion) {
            this.nombreUbicacion = nombreUbicacion;
        }

        public void setDistancia(float Distancia) {
            this.Distancia = Distancia;
        }

        public void setZombies(int Zombies) {
            this.Zombies = Zombies;
        }

        @Override
        public String toString() {
            return "Ubicaciones{" + "nombre de la Ubicacion=" + nombreUbicacion + ", Distancia a Alexandria=" + Distancia + ", Zombies merodeando=" + Zombies + '}';
        }
        public static String mInformacion(ubicaciones f){
            String datos = new String(f.getNombreUbicacion()+" "+f.getDistancia()+" "+f.getZombies());
            return datos;
        }
        public static ubicaciones seguridad(ArrayList<ubicaciones> d){
            int tempo = d.get(0).getZombies();
            int m = 0;
            for (int p = 0; p < d.size(); p++){
                if (d.get(p).getZombies() < tempo) {
                    tempo = d.get(p).getZombies();
                    m = p;
                }
            }
            return d.get(m);
        }
        public static void Intercambio (ubicaciones punto1, ubicaciones punto2){
            punto1.setNombreUbicacion(punto2.getNombreUbicacion());
            punto1.setDistancia(punto2.getDistancia());
            punto1.setZombies(punto2.getZombies());
        }
        public static ArrayList<ubicaciones> OrdenPoblac(ArrayList<ubicaciones> h){
            int menorPoscicion;
            ubicaciones temporal;
            for(int b = 0; b<h.size(); b++){
                menorPoscicion = b;
                for(int m = b+1; m<h.size(); m++){
                    if(h.get(m).getDistancia() < h.get(menorPoscicion).getDistancia()){
                        menorPoscicion= m;
                    }
                }
                temporal = h.get(b);
                h.get(b).Intercambio(h.get(b), h.get(menorPoscicion));
                h.get(menorPoscicion).Intercambio(h.get(menorPoscicion), temporal);
            }
            return h;
        }
    }
