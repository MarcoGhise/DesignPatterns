package it.blog.designpatterns.chainofresponsability;

public abstract class Handler {

	 private Handler next;

   /**
    * Builds chains of middleware objects.
    */
   public Handler linkWith(Handler next) {
       this.next = next;
       return next;
   }

   /**
    * Subclasses will implement this method with concrete checks.
    */
   public abstract boolean check(Product product);

   /**
    * Runs check on the next object in chain or ends traversing if we're in
    * last object in chain.
    */
   protected boolean checkNext(Product product) {
       if (next == null) {
           return true;
       }
       return next.check(product);
   }
}
