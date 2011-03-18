package com.comsysto.insight.model.options;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 18/03/2011
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public class ExportingButtons {

    private ExportButton mExportButton;
    private PrintButton mPrintButton;


    public ExportButton getExportButton() {
        return mExportButton;
    }

    public ExportingButtons setExportButton(ExportButton pExportButton) {
        mExportButton = pExportButton;
        return this;
    }

    public PrintButton getPrintButton() {
        return mPrintButton;
    }

    public ExportingButtons setPrintButton(PrintButton pPrintButton) {
        mPrintButton = pPrintButton;
        return this;
    }
}
