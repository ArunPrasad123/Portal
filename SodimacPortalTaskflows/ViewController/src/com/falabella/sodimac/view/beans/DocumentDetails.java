package com.falabella.sodimac.view.beans;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichDeck;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandNavigationItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.nav.RichNavigationPane;

public class DocumentDetails {
    private RichButton b1;
    private RichGridCell gc4;
    private RichGridCell gc3;
    private RichGridRow gr2;
    private RichPanelGridLayout pgl7;
    private RichPanelGroupLayout pgl6;
    private RichTable t1;
    private RichPanelGroupLayout pgl2;
    private RichLink l2;
    private RichGridCell gc2;
    private RichGridCell gc1;
    private RichGridRow gr1;
    private RichPanelGridLayout pgl5;
    private RichPanelGroupLayout pgl3;
    private RichCommandNavigationItem cni1;
    private RichCommandNavigationItem ni1;
    private RichNavigationPane np1;
    private RichPanelGroupLayout pgl4;
    private RichPanelGroupLayout pgl1;
    private RichDeck d1;

    public DocumentDetails() {
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
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

    public void setPgl7(RichPanelGridLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGridLayout getPgl7() {
        return pgl7;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
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

    public void setPgl5(RichPanelGridLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGridLayout getPgl5() {
        return pgl5;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setCni1(RichCommandNavigationItem cni1) {
        this.cni1 = cni1;
    }

    public RichCommandNavigationItem getCni1() {
        return cni1;
    }

    public void setNi1(RichCommandNavigationItem ni1) {
        this.ni1 = ni1;
    }

    public RichCommandNavigationItem getNi1() {
        return ni1;
    }

    public void setNp1(RichNavigationPane np1) {
        this.np1 = np1;
    }

    public RichNavigationPane getNp1() {
        return np1;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setD1(RichDeck d1) {
        this.d1 = d1;
    }

    public RichDeck getD1() {
        return d1;
    }
    
    public void verTodasAction(ActionEvent actionEvent){
        ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest  request = (HttpServletRequest)ectx.getRequest();
        HttpSession session = request.getSession(false);
               try {
                   String urlRedirect = request.getContextPath() + "/pages_accountstatus"; // Change page name here if required
                   ectx.redirect(urlRedirect);
                   FacesContext.getCurrentInstance().responseComplete(); // Uncomment this if URL in browser is not changing
               } catch (IOException e) {
                   //LOGGER.severe(accessDC.getDisplayRecord() + this.getClass() + " Error while redirecting to account status page");
               }    
    }
}
