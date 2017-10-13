
package com.example.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "substract", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.Substract")
    @ResponseWrapper(localName = "substractResponse", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.SubstractResponse")
    @Action(input = "http://calculator.example.com/CalculatorWS/substractRequest", output = "http://calculator.example.com/CalculatorWS/substractResponse")
    public int substract(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.MultiplyResponse")
    @Action(input = "http://calculator.example.com/CalculatorWS/multiplyRequest", output = "http://calculator.example.com/CalculatorWS/multiplyResponse")
    public int multiply(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.AddResponse")
    @Action(input = "http://calculator.example.com/CalculatorWS/addRequest", output = "http://calculator.example.com/CalculatorWS/addResponse")
    public int add(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://calculator.example.com/", className = "com.example.calculator.DivideResponse")
    @Action(input = "http://calculator.example.com/CalculatorWS/divideRequest", output = "http://calculator.example.com/CalculatorWS/divideResponse")
    public int divide(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
