package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Credit_Rating implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "rating")
   private java.lang.String rating;
   @org.kie.api.definition.type.Label(value = "source")
   private java.lang.String source;

   public Credit_Rating()
   {
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public java.lang.String getSource()
   {
      return this.source;
   }

   public void setSource(java.lang.String source)
   {
      this.source = source;
   }

   public Credit_Rating(java.lang.String rating, java.lang.String source)
   {
      this.rating = rating;
      this.source = source;
   }

}