package modulo2.funcionarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeitorArquivoTexto implements IntegradorNovosFuncionarios {

    @Override
    public List<Funcionario> recuperarDadosNovosFuncionarios() {
        try {
            List<Funcionario> funcionarios = new ArrayList<>();
            Path filePath = Paths.get("C:/Projetos/tomorrow-tech/arquivo-texto/funcionarios");
            List<String> dadosFuncionarios = Files.readAllLines(filePath);
            for (String informacoesFuncionario: dadosFuncionarios) {
                String[] dadosSeparados = informacoesFuncionario.split(" ");
                funcionarios.add(new Funcionario(dadosSeparados[0], dadosSeparados[1]));
            }
            return funcionarios;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
