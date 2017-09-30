package app.devmedia.com.br.appdevmedia.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.List;

import app.devmedia.com.br.appdevmedia.R;
import app.devmedia.com.br.appdevmedia.async.AsyncImageHelper;
import app.devmedia.com.br.appdevmedia.entity.Profissao;
import app.devmedia.com.br.appdevmedia.util.Constantes;

/**
 * Created by Diogo on 02/04/2016.
 */
public class ProfissaoArrayAdapter extends ArrayAdapter<Profissao> {

    private List<Profissao> profissoes;
    private Context context;

    public ProfissaoArrayAdapter(Context context, int resource, List<Profissao> profissoes) {
        super(context, resource);
        this.context = context;
        this.profissoes = profissoes;
    }

    @Override
    public int getCount() {
        return profissoes.size();
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getViewAux(position, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getViewAux(position, parent);
    }

    @NonNull
    private View getViewAux(int position, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View linha = layoutInflater.inflate(R.layout.linha_profissao, parent, false);

        Profissao profissao = profissoes.get(position);

        TextView txtProfissao = (TextView) linha.findViewById(R.id.txtProfissao);
        txtProfissao.setText(profissao.getDescricao());

        TextView txtDescricao = (TextView) linha.findViewById(R.id.txtDescricao);
        txtDescricao.setText(profissao.getSubDescricao());

        ImageView imgProfissao = (ImageView) linha.findViewById(R.id.imgProfissao);
        Picasso.with(imgProfissao.getContext()).load(Constantes.URL_WEB_BASE + profissao.getUrlImg()).into(imgProfissao);
        //new AsyncImageHelper(imgProfissao).execute(Constantes.URL_WEB_BASE + profissao.getUrlImg());

        return linha;
    }

    @Override
    public Profissao getItem(int position) {
        return profissoes.get(position);
    }
}
