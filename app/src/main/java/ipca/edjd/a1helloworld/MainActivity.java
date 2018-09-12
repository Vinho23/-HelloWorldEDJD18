package ipca.edjd.a1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // alt + Enter para a lâmpada importar bibliotecas q precisamos
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    // declarar o TextView exteriormente

    // TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criar um Texto
        final TextView textView = new TextView(this); // só escrever this e context: aparece

        /* final aparece pois a função que chama o TextView lá em baixo, a classe OnClickListener, é
         * abstrata, ou seja, tem métodos vazios. O método onClick não existe, por isso nós temos de
         * o declarar dentro de um bloco { public void onClick() {...} }. Porque é o final criado
         * automaticamente? Porque em POO, dps de usar um objeto, a memória discarda-o. Ele é usado
         * no método onClick, e se não fosse final perderiamos o TextView que usamos posteriormente.
         * Para o final não ser criado acima, podiamos declarar o TextView exteriormente.
         */

        // O que escrever ("Hello World!")
        textView.setText("Hello World!");

        // Criar um botão para traduzir o Hello World
        Button button = new Button(this);
        button.setText("Traduzir");

        // Criar a tradução (ao clicar "traduzir")
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                textView.setText("Olá Mundo!"+count); // ver os cliques no botão
            }
        });

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(textView);
        linearLayout.addView(button);

        setContentView(linearLayout);

        // setContentView(textView);
        // setContentView(button);

        /* comentario */
        // setContentView(R.layout.activity_main);
    }
}
