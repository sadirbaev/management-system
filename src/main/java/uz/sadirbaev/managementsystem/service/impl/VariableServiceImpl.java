package uz.sadirbaev.managementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import uz.sadirbaev.managementsystem.model.Variable;
import uz.sadirbaev.managementsystem.service.VariableService;

import java.util.List;

@Service
public class VariableServiceImpl implements VariableService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Variable> variableList(String line, String machine, String product) {
        return jdbcTemplate.query("select pv.name as n, ppv.usl as usl, ppv.lsl as lsl, ppv.transform_value as tv from process_chain pc " +
                        "    inner join process_chain_element pce on pc.id = pce.ref_process_chain_id " +
                        "        inner join process_chain_machine pcm on pce.id = pcm.ref_process_chain_element " +
                        "            inner join process_chain_product pcp on pcp.ref_process_chain_id = pc.id " +
                        "                inner join product p on pcp.ref_product = p.name " +
                        "                    inner join product_process_var ppv on p.id = ppv.ref_product_id " +
                        "                        inner join process p2 on pcm.ref_process = p2.name " +
                        "                            inner join process_var pv on pv.ref_process_id = p2.id " +
                        "where pc.ref_line=? and pcm.ref_machine=? and p.name=? and pv.id = ppv.ref_process_var_id;",
                ((resultSet, i) -> new Variable(
                        resultSet.getString("n"),
                        resultSet.getDouble("lsl"),
                        resultSet.getDouble("usl"),
                        resultSet.getDouble("tv")
                )), line, machine, product);
    }
}
