package cn.bugstack.ai.domain.agent.model.valobj;

import com.google.adk.runner.InMemoryRunner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AiAgentRegisterVO {

    private String appName;

    private String agentId;

    private String agentName;

    private String agentDesc;

    /**
     * 智能体执行对象
     */
    private InMemoryRunner runner;
}
