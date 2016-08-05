package com.falabella.sodimac.view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.QueryEvent;

import oracle.binding.BindingContainer;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;
import org.apache.myfaces.trinidad.event.RangeChangeEvent;

public class AccountStatus {
    private RichButton b1;
    private RichPanelGroupLayout pgl6;
    private RichTable t2;
    private RichPanelGroupLayout pgl3;
    private RichLink l2;
    private RichGridCell gc2;
    private RichGridCell gc1;
    private RichGridRow gr1;
    private RichPanelGridLayout pgl2;
    private RichPanelGroupLayout pgl5;
    private RichSpacer s1;
    private RichPanelGroupLayout pgl9;
    private RichLink l3;
    private RichGridCell gc4;
    private RichOutputText ot14;
    private RichGridCell gc3;
    private RichGridRow gr2;
    private RichPanelGridLayout pgl10;
    private RichPanelGroupLayout pgl11;
    private RichPanelGroupLayout pgl1;
    private RichButton b2;
    private RichGridCell gc10;
    private RichOutputText ot4;
    private RichGridCell gc9;
    private RichGridRow gr6;
    private RichOutputLabel ol5;
    private RichOutputLabel ol4;
    private RichOutputLabel ol3;
    private RichOutputLabel ol2;
    private RichOutputLabel ol1;
    private RichTable t1;
    private RichGridCell gc8;
    private RichGridRow gr5;
    private RichGridCell gc7;
    private RichOutputText ot3;
    private RichGridCell gc6;
    private RichGridRow gr4;
    private RichPanelGridLayout pgl4;
    private RichPanelGroupLayout pgl7;
    private RichPanelGroupLayout pgl8;
    private RichLink l5;
    private RichOutputText ot17;

    public AccountStatus() {
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setL2(RichLink l2) {
        this.l2 = l2;
    }

    public RichLink getL2() {
        return l2;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }


    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setOt14(RichOutputText ot14) {
        this.ot14 = ot14;
    }

    public RichOutputText getOt14() {
        return ot14;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setPgl10(RichPanelGridLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGridLayout getPgl10() {
        return pgl10;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setOt4(RichOutputText ot4) {
        this.ot4 = ot4;
    }

    public RichOutputText getOt4() {
        return ot4;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setPgl4(RichPanelGridLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGridLayout getPgl4() {
        return pgl4;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }
    
    public void verTodasAction(ActionEvent e){
        DCBindingContainer bindings=getBindings();
        DCIteratorBinding iterator=(DCIteratorBinding)bindings.get("documentsRangeIterator");
        iterator.setRangeSize(20);
        getT2().setAutoHeightRows(20);
        getT2().setFetchSize(20);
        getPgl7().setVisible(false);
        getL3().setVisible(false);
        getL5().setVisible(true);
        AdfFacesContext.getCurrentInstance().addPartialTarget(getPgl7());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getT2());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getL3());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getL5());
    }
    
    public DCBindingContainer getBindings(){
        BindingContext bindingContext=BindingContext.getCurrent();
        DCBindingContainer bindings=(DCBindingContainer)bindingContext.getCurrentBindingsEntry();
        return bindings;
    }
    
    public void espaldaAction(ActionEvent e){
        DCBindingContainer bindings=getBindings();
        DCIteratorBinding iterator=(DCIteratorBinding)bindings.get("documentsRangeIterator");
        iterator.setRangeSize(10);
        getT2().setAutoHeightRows(10);
        getT2().setFetchSize(10);
        getPgl7().setVisible(true);
        getL3().setVisible(true);
        getL5().setVisible(false);
        AdfFacesContext.getCurrentInstance().addPartialTarget(getPgl7());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getT2());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getL3());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getL5());
    }
    
    public int getLineCount() {
        System.err.println("Its invoked");
        DCBindingContainer bindings = getBindings();
        DCIteratorBinding iter = bindings.findIteratorBinding("documentsRangeIterator");
        System.err.println("rangeend:"+iter.getAllRowsInRange().length);
        return iter.getRowSetIterator().getRowCount();
    }
    
    public void setL5(RichLink l5) {
        this.l5 = l5;
    }

    public RichLink getL5() {
        return l5;
    }
    
    public void rangeChange(AttributeChangeEvent rangeEvent) {
        System.err.println("Range is changed"+rangeEvent);       
    }

    public void setOt17(RichOutputText ot17) {
        this.ot17 = ot17;
    }

    public RichOutputText getOt17() {
        return ot17;
    }
}
