public enum OrdenarClientes implements Comparator {
 
  PorIdade() {
        public int compare(Cliente one, Cliente other) {
           return one.getIdade.compareTo(other.getIdade());
        }
     },
      
     PorNome() {
         public int compare(Cliente one, Cliente other) {
            return one.getNome().compareTo(other.getNome());
         }
      };
 
 
     public abstract int compare(Cliente one, Cliente other);
 
     public Comparator asc() {
        return this;
     }
 
     public Comparator desc() {
        return Collections.reverseOrder(this);
     }
}
