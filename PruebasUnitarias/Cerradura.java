class Cerradura {
   
    int cantidadIntentos;
    int fallidas;
    int exitos;
    int clave;
    boolean abierto;
    boolean bloqueado;
   
   
      Cerradura (int claveDeApertura , int CantidadDeIntentosDeBloqueo){
          if(claveDeApertura < 0 && CantidadDeIntentosDeBloqueo < 0){
              throw new Error("ingresar clave o cantidad mayores o iguales a 0");
          }
         
          clave = claveDeApertura;
          cantidadIntentos = CantidadDeIntentosDeBloqueo;
          exitos = 0;
          fallidas = 0;
          abierto = false;
          bloqueado = false;
      }
     
      public boolean abrir(int clave){
          verificandoBloqueo();
          verificandoEstadoDeCerradura();
              if(this.clave == clave && !bloqueado){
                  exitos++;
                  abierto = true;
              }else {
                  fallidas++;
                  preparandoBloqueo();
              }
          return abierto;
      }
 
    private void verificandoEstadoDeCerradura() throws Error{
        if(estaAbierto()){
              throw new Error ("ya esta abierto hermano");
          }
    }
 
    private void verificandoBloqueo() throws Error {
        if(fueBloqueado()){
              throw new Error("ya esta bloqueado, despedite de tu cerradura lince");
          }
    }
     
      public void cerrar(){
          if(estaCerrado()){
              throw new Error ("ya esta cerrado bro");
          }
          abierto = false;
      }
       
      private void preparandoBloqueo(){
          if(fallidas == cantidadIntentos){
              bloqueado = true;
          }
      }
     
      public boolean estaAbierto(){
          return abierto;
      }
     
      public boolean estaCerrado(){
          return !abierto;
      }
     
      public boolean fueBloqueado(){
          return bloqueado;
      }
     
      public int contarAperturasExistosas(){
          return exitos;
      }
     
      public int contarAperturaFallidas(){
          return fallidas;
      }
}