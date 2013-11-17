package controlefinanceiro.form;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlefinanceiro.dao.Despesa;

public class TableModelDespesa extends AbstractTableModel {

    private static final long  serialVersionUID = 1L;

    private String             titulos[]        = { "Código", "Descrição",
            "Valor", "Data", "Tipo", "Pago?"   };

    private DateFormat         df               = DateFormat.getDateInstance();
    private NumberFormat       nf               = NumberFormat.getInstance();

    private ArrayList<Despesa> colDespesa       = new ArrayList<Despesa>();

    @Override
    public String getColumnName(int column) {
        return this.titulos[column];
    }

    @Override
    public int getColumnCount() {
        return this.titulos.length;
    }

    @Override
    public int getRowCount() {
        if (this.colDespesa == null)
            return 0;
        else
            return this.colDespesa.size();
    }

    @Override
    public Object getValueAt(int row, int col) {

        switch (col) {
            case 0:
                return this.colDespesa.get(row).getOid();
            case 1:
                return this.colDespesa.get(row).getDescricao();
            case 2:
                return this.nf.format(this.colDespesa.get(row).getValor());
            case 3:
                return this.df.format(this.colDespesa.get(row).getData());
            case 4:
                return this.colDespesa.get(row).getTipo().getDescricao();
            case 5:
                return this.colDespesa.get(row).isPago() ? "Sim" : "Não";
            default:
                return null;
        }

    }

}
