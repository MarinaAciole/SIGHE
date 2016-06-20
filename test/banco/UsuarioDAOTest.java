/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Marina
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp UsuarioTestDAO");
        try {
            Connection conn = new Banco().getConn();
            String sql = "DELETE FROM usuario WHERE matricula = 1234";
            java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("erro na exclusao");
            Logger.getLogger(UsuarioDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class UsuarioDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        
        Usuario usuario = new Usuario();
        usuario.setMatricula("1234");
        
        UsuarioDAO instance = null;
        
        // Matricula nao existe
        instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.inserir(usuario);
        assertEquals(expResult, result);
        
        //Matricula ja existe
        instance = new UsuarioDAO();
        expResult = false;
        result = instance.inserir(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of Excluir method, of class UsuarioDAO.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("Excluir");
        String id = "";
        UsuarioDAO instance = new UsuarioDAO();
        instance.excluir(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class UsuarioDAO.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("Editar");
        String id = "";
        String nome = "";
        String curso = "";
        String funcao = "";
        String tel = "";
        String email = "";
        UsuarioDAO instance = new UsuarioDAO();

        Usuario u = new Usuario();
        u.setNome(nome);
        u.setCurso(curso);
        u.setFuncao(funcao);
        u.setTelefone(tel);
        u.setEmail(email);
        u.setIdUsuario(id);
        instance.editar(u);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testPegarUsuario() throws Exception {
        System.out.println("pegarUsuario");
        String id = "";
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.pegarUsuario(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selecionarAlunos method, of class UsuarioDAO.
     */
    @Test
    public void testSelecionarAlunos() throws Exception {
        System.out.println("selecionarAlunos");
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.selecionarAlunos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarAlunos method, of class UsuarioDAO.
     */
    @Test
    public void testFiltrarAlunos() throws Exception {
        System.out.println("filtrarAlunos");
        String filtro = "";
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.filtrarAlunos(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selecionarProfessores method, of class UsuarioDAO.
     */
    @Test
    public void testSelecionarProfessores() throws Exception {
        System.out.println("selecionarProfessores");
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.selecionarProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarProfessores method, of class UsuarioDAO.
     */
    @Test
    public void testFiltrarProfessores() throws Exception {
        System.out.println("filtrarProfessores");
        String filtro = "";
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.filtrarProfessores(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selecionarFuncionarios method, of class UsuarioDAO.
     */
    @Test
    public void testSelecionarFuncionarios() throws Exception {
        System.out.println("selecionarFuncionarios");
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.selecionarFuncionarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarFuncionarios method, of class UsuarioDAO.
     */
    @Test
    public void testFiltrarFuncionarios() throws Exception {
        System.out.println("filtrarFuncionarios");
        String filtro = "";
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.filtrarFuncionarios(filtro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
