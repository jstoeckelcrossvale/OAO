package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Account")
public class Account implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Customer Number")
   private java.lang.String customerNumber;

   @org.kie.api.definition.type.Label("label")
   private java.lang.String label;

   @org.kie.api.definition.type.Label("type")
   private java.lang.String type;

   @org.kie.api.definition.type.Label(value = "balance")
   private com.crossvale.oao.Balance balance;

   @org.kie.api.definition.type.Label(value = "branch_id")
   private java.lang.String branch_id;

   @org.kie.api.definition.type.Label(value = "account_routing")
   private com.crossvale.oao.Account_routing account_routing;

   public Account()
   {
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getLabel()
   {
      return this.label;
   }

   public void setLabel(java.lang.String label)
   {
      this.label = label;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public com.crossvale.oao.Balance getBalance()
   {
      return this.balance;
   }

   public void setBalance(com.crossvale.oao.Balance balance)
   {
      this.balance = balance;
   }

   public java.lang.String getBranch_id()
   {
      return this.branch_id;
   }

   public void setBranch_id(java.lang.String branch_id)
   {
      this.branch_id = branch_id;
   }

   public com.crossvale.oao.Account_routing getAccount_routing()
   {
      return this.account_routing;
   }

   public void setAccount_routing(com.crossvale.oao.Account_routing account_routing)
   {
      this.account_routing = account_routing;
   }

   public Account(java.lang.String customerNumber, java.lang.String label,
         java.lang.String type, com.crossvale.oao.Balance balance,
         java.lang.String branch_id,
         com.crossvale.oao.Account_routing account_routing)
   {
      this.customerNumber = customerNumber;
      this.label = label;
      this.type = type;
      this.balance = balance;
      this.branch_id = branch_id;
      this.account_routing = account_routing;
   }

}