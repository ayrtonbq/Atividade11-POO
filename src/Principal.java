import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {
    private JComboBox<String> comboBox;
    private JButton button;

    public Principal() {
        setTitle("Atividade 11");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] formas = {"Triângulo", "Quadrado", "Retângulo", "Círculo", "Cubo", "Esfera", "Cilindro"};
        comboBox = new JComboBox<>(formas);
        button = new JButton("Calcular");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Escolha a forma geométrica:"));
        panel.add(comboBox);
        panel.add(button);
        add(panel);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = comboBox.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                criarTriangulo();
                break;
            case 1:
                criarQuadrado();
                break;
            case 2:
                criarRetangulo();
                break;
            case 3:
                criarCirculo();
                break;
            case 4:
                criarCubo();
                break;
            case 5:
                criarEsfera();
                break;
            case 6:
                criarCilindro();
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }

    public void criarTriangulo() {
        String baseStr = JOptionPane.showInputDialog("Digite a base do triângulo:");
        String alturaStr = JOptionPane.showInputDialog("Digite a altura do triângulo:");
        if (baseStr != null && !baseStr.isEmpty() && alturaStr != null && !alturaStr.isEmpty()) {
            try {
                double base = Double.parseDouble(baseStr);
                double altura = Double.parseDouble(alturaStr);
                Triângulo triangulo = new Triângulo(base, altura);
                imprimirInformacoes(triangulo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para a base ou altura do triângulo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarQuadrado() {
        String ladoStr = JOptionPane.showInputDialog("Digite o lado do quadrado:");
        if (ladoStr != null && !ladoStr.isEmpty()) {
            try {
                double lado = Double.parseDouble(ladoStr);
                Quadrado quadrado = new Quadrado(lado);
                imprimirInformacoes(quadrado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para o lado do quadrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarRetangulo() {
        String baseStr = JOptionPane.showInputDialog("Digite a base do retângulo:");
        String alturaStr = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        if (baseStr != null && !baseStr.isEmpty() && alturaStr != null && !alturaStr.isEmpty()) {
            try {
                double base = Double.parseDouble(baseStr);
                double altura = Double.parseDouble(alturaStr);
                Retângulo retangulo = new Retângulo(base, altura);
                imprimirInformacoes(retangulo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para a base ou altura do retângulo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarCirculo() {
        String raioStr = JOptionPane.showInputDialog("Digite o raio do círculo:");
        if (raioStr != null && !raioStr.isEmpty()) {
            try {
                double raio = Double.parseDouble(raioStr);
                Círculo circulo = new Círculo(raio);
                imprimirInformacoes(circulo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para o raio do círculo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarCubo() {
        String ladoStr = JOptionPane.showInputDialog("Digite o lado do cubo:");
        if (ladoStr != null && !ladoStr.isEmpty()) {
            try {
                double lado = Double.parseDouble(ladoStr);
                Cubo cubo = new Cubo(lado);
                imprimirInformacoes(cubo);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para o lado do cubo!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarEsfera() {
        String raioStr = JOptionPane.showInputDialog("Digite o raio da esfera:");
        if (raioStr != null && !raioStr.isEmpty()) {
            try {
                double raio = Double.parseDouble(raioStr);
                Esfera esfera = new Esfera(raio);
                imprimirInformacoes(esfera);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para o raio da esfera!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void criarCilindro() {
        String raioBaseStr = JOptionPane.showInputDialog("Digite o raio da base do cilindro:");
        String alturaStr = JOptionPane.showInputDialog("Digite a altura do cilindro:");
        if (raioBaseStr != null && !raioBaseStr.isEmpty() && alturaStr != null && !alturaStr.isEmpty()) {
            try {
                double raioBase = Double.parseDouble(raioBaseStr);
                double altura = Double.parseDouble(alturaStr);
                Cilindro cilindro = new Cilindro(raioBase, altura);
                imprimirInformacoes(cilindro);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor inválido para o raio da base ou altura do cilindro!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void imprimirInformacoes(FormaGeométrica forma) {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Nome: ").append(forma.getClass().getSimpleName()).append("\n");
        mensagem.append("Área: ").append(forma.calcularArea()).append("\n");
        mensagem.append("Perímetro: ").append(forma.calcularPerimetro()).append("\n");

        if (forma instanceof Forma3D) {
            Forma3D forma3D = (Forma3D) forma;
            mensagem.append("Volume: ").append(forma3D.calcularVolume()).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensagem.toString(), "Informações da forma geométrica", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true);
        });
    }
}
