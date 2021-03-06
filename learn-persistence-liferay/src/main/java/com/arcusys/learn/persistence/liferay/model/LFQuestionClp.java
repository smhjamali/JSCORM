package com.arcusys.learn.persistence.liferay.model;

import com.arcusys.learn.persistence.liferay.service.LFQuestionLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;


public class LFQuestionClp extends BaseModelImpl<LFQuestion>
    implements LFQuestion {
    private long _id;
    private Integer _categoryId;
    private String _title;
    private String _description;
    private String _explanationText;
    private boolean _forceCorrectCount;
    private boolean _caseSensitive;
    private Integer _questionType;
    private Integer _courseId;
    private Integer _arrangementIndex;
    private BaseModel<?> _lfQuestionRemoteModel;

    public LFQuestionClp() {
    }

    public Class<?> getModelClass() {
        return LFQuestion.class;
    }

    public String getModelClassName() {
        return LFQuestion.class.getName();
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("categoryId", getCategoryId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("explanationText", getExplanationText());
        attributes.put("forceCorrectCount", getForceCorrectCount());
        attributes.put("caseSensitive", getCaseSensitive());
        attributes.put("questionType", getQuestionType());
        attributes.put("courseId", getCourseId());
        attributes.put("arrangementIndex", getArrangementIndex());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer categoryId = (Integer) attributes.get("categoryId");

        if (categoryId != null) {
            setCategoryId(categoryId);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String explanationText = (String) attributes.get("explanationText");

        if (explanationText != null) {
            setExplanationText(explanationText);
        }

        Boolean forceCorrectCount = (Boolean) attributes.get(
                "forceCorrectCount");

        if (forceCorrectCount != null) {
            setForceCorrectCount(forceCorrectCount);
        }

        Boolean caseSensitive = (Boolean) attributes.get("caseSensitive");

        if (caseSensitive != null) {
            setCaseSensitive(caseSensitive);
        }

        Integer questionType = (Integer) attributes.get("questionType");

        if (questionType != null) {
            setQuestionType(questionType);
        }

        Integer courseId = (Integer) attributes.get("courseId");

        if (courseId != null) {
            setCourseId(courseId);
        }

        Integer arrangementIndex = (Integer) attributes.get("arrangementIndex");

        if (arrangementIndex != null) {
            setArrangementIndex(arrangementIndex);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public Integer getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        _categoryId = categoryId;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getExplanationText() {
        return _explanationText;
    }

    public void setExplanationText(String explanationText) {
        _explanationText = explanationText;
    }

    public boolean getForceCorrectCount() {
        return _forceCorrectCount;
    }

    public boolean isForceCorrectCount() {
        return _forceCorrectCount;
    }

    public void setForceCorrectCount(boolean forceCorrectCount) {
        _forceCorrectCount = forceCorrectCount;
    }

    public boolean getCaseSensitive() {
        return _caseSensitive;
    }

    public boolean isCaseSensitive() {
        return _caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        _caseSensitive = caseSensitive;
    }

    public Integer getQuestionType() {
        return _questionType;
    }

    public void setQuestionType(Integer questionType) {
        _questionType = questionType;
    }

    public Integer getCourseId() {
        return _courseId;
    }

    public void setCourseId(Integer courseId) {
        _courseId = courseId;
    }

    public Integer getArrangementIndex() {
        return _arrangementIndex;
    }

    public void setArrangementIndex(Integer arrangementIndex) {
        _arrangementIndex = arrangementIndex;
    }

    public BaseModel<?> getLFQuestionRemoteModel() {
        return _lfQuestionRemoteModel;
    }

    public void setLFQuestionRemoteModel(BaseModel<?> lfQuestionRemoteModel) {
        _lfQuestionRemoteModel = lfQuestionRemoteModel;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            LFQuestionLocalServiceUtil.addLFQuestion(this);
        } else {
            LFQuestionLocalServiceUtil.updateLFQuestion(this);
        }
    }

    @Override
    public LFQuestion toEscapedModel() {
        return (LFQuestion) Proxy.newProxyInstance(LFQuestion.class.getClassLoader(),
            new Class[] { LFQuestion.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LFQuestionClp clone = new LFQuestionClp();

        clone.setId(getId());
        clone.setCategoryId(getCategoryId());
        clone.setTitle(getTitle());
        clone.setDescription(getDescription());
        clone.setExplanationText(getExplanationText());
        clone.setForceCorrectCount(getForceCorrectCount());
        clone.setCaseSensitive(getCaseSensitive());
        clone.setQuestionType(getQuestionType());
        clone.setCourseId(getCourseId());
        clone.setArrangementIndex(getArrangementIndex());

        return clone;
    }

    public int compareTo(LFQuestion lfQuestion) {
        long primaryKey = lfQuestion.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFQuestionClp lfQuestion = null;

        try {
            lfQuestion = (LFQuestionClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfQuestion.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", categoryId=");
        sb.append(getCategoryId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", explanationText=");
        sb.append(getExplanationText());
        sb.append(", forceCorrectCount=");
        sb.append(getForceCorrectCount());
        sb.append(", caseSensitive=");
        sb.append(getCaseSensitive());
        sb.append(", questionType=");
        sb.append(getQuestionType());
        sb.append(", courseId=");
        sb.append(getCourseId());
        sb.append(", arrangementIndex=");
        sb.append(getArrangementIndex());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFQuestion");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>categoryId</column-name><column-value><![CDATA[");
        sb.append(getCategoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>explanationText</column-name><column-value><![CDATA[");
        sb.append(getExplanationText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>forceCorrectCount</column-name><column-value><![CDATA[");
        sb.append(getForceCorrectCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>caseSensitive</column-name><column-value><![CDATA[");
        sb.append(getCaseSensitive());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>questionType</column-name><column-value><![CDATA[");
        sb.append(getQuestionType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseId</column-name><column-value><![CDATA[");
        sb.append(getCourseId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arrangementIndex</column-name><column-value><![CDATA[");
        sb.append(getArrangementIndex());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
