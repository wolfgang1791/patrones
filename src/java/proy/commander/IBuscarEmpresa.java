/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.commander;

import java.util.List;
import proy.entidad.Empresa;

/**
 *
 * @author Jonathan
 */
public interface IBuscarEmpresa {
    public List<Empresa> buscar(String paradero);
}
