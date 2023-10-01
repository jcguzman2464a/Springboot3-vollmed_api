create table consultas(

    id bigint not null auto_increment,
    medico_id bigint not null,
    paciente_id bigint not null,
    fecha datetime not null,
<<<<<<< HEAD
=======
    motivo_cancelamiento varchar(100) ,
>>>>>>> 8925553c3f821d8f9eb8daaaa432cace1b56d1c6

    primary key(id),

    constraint fk_consultas_medico_id foreign key(medico_id) references medicos(id),
    constraint fk_consultas_paciente_id foreign key(paciente_id) references pacientes(id)

);