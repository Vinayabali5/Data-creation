package uk.ac.reigate.domain.exam;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExamOption is a Querydsl query type for ExamOption
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExamOption extends EntityPathBase<ExamOption> {

    private static final long serialVersionUID = -514653766L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExamOption examOption = new QExamOption("examOption");

    public final StringPath endorsementToFirstGradeResultGradeset = createString("endorsementToFirstGradeResultGradeset");

    public final StringPath endorsementToSecondGradeResultGradeset = createString("endorsementToSecondGradeResultGradeset");

    public final NumberPath<Integer> examinationFee = createNumber("examinationFee", Integer.class);

    public final NumberPath<Integer> examOptionId = createNumber("examOptionId", Integer.class);

    public final QExamType examTypeCert;

    public final QExamType examTypeUnit;

    public final StringPath feeDefined = createString("feeDefined");

    public final StringPath firstForecastGradeGradeset = createString("firstForecastGradeGradeset");

    public final StringPath firstGradeResultGradeset = createString("firstGradeResultGradeset");

    public final NumberPath<Integer> maxMarkUms = createNumber("maxMarkUms", Integer.class);

    public final SimplePath<groovy.lang.MetaClass> metaClass = createSimple("metaClass", groovy.lang.MetaClass.class);

    public final NumberPath<Integer> noOfComponents = createNumber("noOfComponents", Integer.class);

    public final ListPath<OptionComponent, QOptionComponent> optionComponents = this.<OptionComponent, QOptionComponent>createList("optionComponents", OptionComponent.class, QOptionComponent.class, PathInits.DIRECT2);

    public final StringPath optionEntryCode = createString("optionEntryCode");

    public final StringPath optionTitle = createString("optionTitle");

    public final StringPath process = createString("process");

    public final StringPath qcaAccreditationNo = createString("qcaAccreditationNo");

    public final StringPath qcaClassificationCode = createString("qcaClassificationCode");

    public final StringPath resultType = createString("resultType");

    public final StringPath secondForecastGradeGradeset = createString("secondForecastGradeGradeset");

    public final StringPath secondGradeResultGradeset = createString("secondGradeResultGradeset");

    public final QSyllabus syllabus;

    public QExamOption(String variable) {
        this(ExamOption.class, forVariable(variable), INITS);
    }

    public QExamOption(Path<? extends ExamOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExamOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExamOption(PathMetadata metadata, PathInits inits) {
        this(ExamOption.class, metadata, inits);
    }

    public QExamOption(Class<? extends ExamOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.examTypeCert = inits.isInitialized("examTypeCert") ? new QExamType(forProperty("examTypeCert")) : null;
        this.examTypeUnit = inits.isInitialized("examTypeUnit") ? new QExamType(forProperty("examTypeUnit")) : null;
        this.syllabus = inits.isInitialized("syllabus") ? new QSyllabus(forProperty("syllabus"), inits.get("syllabus")) : null;
    }

}

