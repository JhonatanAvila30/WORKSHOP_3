public class ModeloAprendizaje {
    private Feedback feedback;


    public ModeloAprendizaje(Feedback feedback  ) {
        this.feedback = feedback;
    }

    public ModeloAprendizaje() {
    }

    public void entrenarModelo(){
        String mensaje;
        mensaje= feedback.getComentario();
        if (mensaje.equals("")){
            System.out.println("el modelo no está aprendiendo");
        }else {
            if(!feedback.traerTextoEntrada().equals("") && feedback.traerIdiomaEntrada().equals("Español") && feedback.traerIdiomaSalida().equals("Ingles")){
                System.out.println("el modelo está aprendiendo");
            }
            else {
                if(!feedback.traerTextoEntrada().equals("") && feedback.traerIdiomaEntrada().equals("Ingles") && feedback.traerIdiomaSalida().equals("Español")){
                    System.out.println("el modelo está aprendiendo ");
                }else {
                    System.out.println("Error al intentar  entrenar el modelo");
                }
            }

        }


    }

}
