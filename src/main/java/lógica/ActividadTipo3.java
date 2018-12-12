package lógica;

public class ActividadTipo3 extends Actividad {
	private String[] respuestaCorrecta;

	public ActividadTipo3() {
            super();
	}
        
        public ActividadTipo3(String titulo, String enunciado, String[] respuestaCorrecta) {
            super(titulo, enunciado);
            this.respuestaCorrecta=respuestaCorrecta;   
	}

    public String[] getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String[] respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
        
	public void inicializarActividad() {
		throw new UnsupportedOperationException();
	}

	public boolean comprobarRespuesta(String[] respuestaUsuario) {
		if(respuestaCorrecta==respuestaUsuario){
                    return true;
                }else{
                    return false;
                }
	}

}