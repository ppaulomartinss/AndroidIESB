package br.iesb.androidiesb.adapter;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.iesb.androidiesb.R;
import br.iesb.androidiesb.model.Escola;

/**
 * Created by Paulo on 25/11/2017.
 */

public class EscolaAdapter extends RecyclerView.Adapter<EscolaAdapter.EscolaViewHolder> {

    private Context context;
    private List<Escola> escolasList;

    public EscolaAdapter(Context context, List<Escola> escolasList) {
        this.context = context;
        this.escolasList = escolasList;
    }

    @Override
    public EscolaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.formato_itens_escola, parent, false);
        return new EscolaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EscolaViewHolder holder, int position) {
        Escola escola = escolasList.get(position);
        holder.txtNomeEscola.setText(escola.getNome());
        holder.txtEmail.setText(escola.getEmail());
        holder.txtRede.setText(escola.getRede());
        holder.txtEsfera.setText(escola.getEsferaAdministrativa());
        holder.qtdAlunos.setText(escola.getQtdAlunos() + "");
    }

    @Override
    public int getItemCount() {
        return escolasList.size();
    }

    public class EscolaViewHolder extends RecyclerView.ViewHolder {

        TextView txtNomeEscola;
        TextView txtEmail;
        TextView txtRede;
        TextView txtEsfera;
        TextView qtdAlunos;

        public EscolaViewHolder(View itemView) {
            super(itemView);

            txtNomeEscola = (TextView) itemView.findViewById(R.id.txtNomeEscola);
            txtEmail = (TextView) itemView.findViewById(R.id.txtEmail);
            txtRede = (TextView) itemView.findViewById(R.id.txtRede);
            txtEsfera = (TextView) itemView.findViewById(R.id.txtEsfera);
            qtdAlunos = (TextView) itemView.findViewById(R.id.qtdAlunos);

        }
    }
}